Hi.view(function (_) {

     _.startup_aux = [];
    _.$postLoad = function () {
        callStartups();
        initScroll();
        $('.tokenfield').tokenfield();
        _.isFirstLoad = true;

        initScroll();
        // Define element
        var slider_tooltip = document.getElementById('noui-slider-tooltip');

        // Create slider
        noUiSlider.create(slider_tooltip, {
            start: [0, 5],
            tooltips: true,
            step: 0.5,
            connect: true,
            range: {
                'min': 0,
                'max': 5
            }
        });

        // Define elements for values
        var slider_tooltip_vals = [
            document.getElementById('noui-slider-tooltip-lower-val'),
            document.getElementById('noui-slider-tooltip-upper-val')
        ];

        // Show the values
        slider_tooltip.noUiSlider.on('update', function (values, handle) {
            slider_tooltip_vals[handle].innerHTML = values[handle];
        });

    }
    
    function callStartups(){
        StartupsFrontier.getAll().try(function(result){
            console.log(result);
           _.startup_aux = result;
           _.$apply();
       });
    }

    _.viewProfile = function (username) {
        Hi.redirect("startups/profile?id=" + username);
    }
    _.memberProfile = function (username) {
        Hi.redirect("members/profile?id=" + username);
    }

    _.findStartups = function () {
        _.findingStartups = true;
        _.refreshList();
    }


    _.preListFecth = function (filter) {
        if (!_.isFirstLoad) {
            filter.keywords = $('.keywords-filter').val();
            filter.creation_year = "";
            if (_.existanceYears) {
                filter.creation_year = $('#periods-filters').val();
            }
            filter.min_rating = $('#noui-slider-tooltip-lower-val').html();
            filter.max_rating = $('#noui-slider-tooltip-upper-val').html();
            console.log(filter);
        } else {
            filter.keywords = "";
            filter.creation_year = "";
            if (_.existanceYears) {
                filter.creation_year = "" + _.existanceYears[0] + "";
            }
            filter.min_rating = 0;
            filter.max_rating = 5;
        }
        _.showLoader();
    }

    _.postListFecth = function (result) {
        //return;
        //Hide hilist if no pages found!
        if (result.totalPagesMatch == 1) {
            $('.hilist-footer').hide();
        }

        _.hideLoader();
        _.findingStartups = false;

        //ON frist load
        $('.startups-list-container').show();
        $('.loading-png-container').hide();
        $('startups-find-btn').prop('disabled', false);
        _.isFirstLoad = false;
    }



    _.refreshList = function () {
        if (!_.startupsList.pages[0]) {
            _.startupsList.refresh();
        } else {
            _.startupsList.goToPage(1);
        }
    }

    _.showLoader = function () {
        $('.startup-row').addClass('blink');
    }

    _.hideLoader = function () {
        $('.startup-row').removeClass('blink');
    }

});
