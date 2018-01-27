Hi.view(function (_) {

    _.members_aux = [];
    _.$postLoad = function () {
        initScroll();
        $('.tokenfield').tokenfield();
        _.isFirstLoad = true;
    }


    _.viewProfile = function (username) {
//        Hi.redirect("members/profile?id=" + username);
    }

    _.findMembers = function () {
        _.findingMembers = true;
        _.refreshList();
    }


    _.preListFecth = function (filter) {
        filter.keywords = $('#keywords-filter').val();
        if(filter.keywords == undefined){
            filter.keywords = '';
        }
        
        filter.technologies = $('#technologies-filter').val();
        if(filter.technologies == undefined){
            filter.technologies = '';
        }

        filter.title = $('#title-filter').val();
        if(filter.title == undefined){
            filter.title = '';
        }
        
        filter.gender = $('#gender-filter').val();
        if(filter.gender == undefined){
            filter.gender = '';
        }
        
        filter.city = $('#city-filter').val();
        if(filter.city == undefined){
            filter.city = '';
        }
        
        filter.occupation = $('#occupation-filter').val();
        if(filter.occupation == undefined){
            filter.occupation = '';
        }
        
        console.log(filter);
        _.showLoader();
    }

    _.postListFecth = function (result) {
        //Hide hilist if no pages found!
        if (result.totalPagesMatch == 1) {
            $('.hilist-footer').hide();
        } else {
            $('.hilist-footer').show();
        }

        _.hideLoader();
        _.findingMembers = false;

        //ON frist load
        $('.members-list-container').show();
        $('.loading-png-container').hide();
        $('members-find-btn').prop('disabled', false);
        _.isFirstLoad = false;
    }



    _.refreshList = function () {
        if (!_.membersList.pages[0]) {
            _.membersList.refresh();
        } else {
            _.membersList.goToPage(1);
        }
    }

    _.showLoader = function () {
        $('.member-row').addClass('blink');
    }

    _.hideLoader = function () {
        $('.member-row').removeClass('blink');
    }



});
