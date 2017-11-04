Hi.view(function(_){
    
    _.$postLoad = function(){
       $('.hilist-footer').hide();
       initScroll();
    }
    
    _.memberProfile = function(username){
        Hi.redirect("members/profile?id="+username);
    }
    
    
    
    _.preListFecth = function(filter){
        filter.startup_id = _.startup.id;
        _.showLoader();
    }
    
    _.postListFecth = function(result){
        //return;
        //Hide hilist if no pages found!
        if(result.totalPagesMatch==1){
            $('.hilist-footer').hide();
        }
        
        _.hideLoader();
        $('.members-preloader').hide();
        _.isFirstLoad = false;
    }
    
    
    
    _.refreshList = function(){
        if(!_.membersList.pages[0]){
            _.membersList.refresh();
        }else{
            _.membersList.goToPage(1);
        }
    }
    
    _.showLoader = function(){
        $('.member-row').addClass('blink2');
    }
    
    _.hideLoader = function(){
        $('.member-row').removeClass('blink2');
    }

});
