Hi.view(function (_) {


    _.$postLoad = function () {
        $('.hilist-footer').hide();
        _.isFirstLoad = true;

    }

    _.startupProfile = function (username) {
        Hi.redirect("startups/profile?id=" + username);
    }

    _.memberProfile = function (username) {
        Hi.redirect("members/profile?id=" + username);
    }


    _.preListFecth = function (filter) {
        filter.member_id = _.member.id;
        _.showLoader();
    }

    _.postListFecth = function (result) {
        //return;
        //Hide hilist if no pages found!
        if (result.totalPagesMatch == 1) {
            $('.hilist-footer').hide();
        }

        _.hideLoader();
        $('.startups-list-container').show();
        $('.startus-preloader').hide();
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
        $('.startup-row').addClass('blink2');
    }

    _.hideLoader = function () {
        $('.startup-row').removeClass('blink2');
    }

    _.flushOnServer = function () {
        swal({
            title: "Tem, certeza?",
            text: "Uma vez actualizados os dados, assim serão guardados!",
            icon: "warning",
            buttons: true,
            dangerMode: true,
        })
                .then((willDelete) => {
                    if (willDelete) {
                        update();
                        swal("Os dados ja foram actualizados!", {
                            icon: "success",
                        });
                    } else {
                        swal("Dados não foram actualizados!");
                    }
                });
    }

    function update() {
        MemberFrontier.updateMemberInfo(_.member).try(function (result) {   
            if(result){
                swal("Parabens!", "Dados actualizados!", "success");
            }else{
                swal("Error!", "Falha no servidor a tentar actualizar os dados!", "error");
            }
        }); 
    }




});
