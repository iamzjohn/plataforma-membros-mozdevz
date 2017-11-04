Hi.view(function(_){
    
    _.members_aux = [];
    _.$postLoad = function(){
       initScroll();
       $('.tokenfield').tokenfield();
       _.isFirstLoad = true;
       
//        callMembers();
    }
    
    function callMembers(){
//        MembersFrontier.getAllMembers().try(function(result){
        MembersFrontier.fetch(1, 24, {"keywords": "", "technologies" : ""} ,{}).try(function(result){
           _.members_aux = result;
           _.$apply();
       });
    }
    
    _.callFrontier = callMembers();
    
    _.viewProfile = function(username){
        Hi.redirect("members/profile?id="+username);
    }
    
    _.findMembers = function(){
        _.findingMembers = true;
        _.refreshList();
    }
    
    
    _.preListFecth = function(filter){
        filter.keywords = $('#keywords-filter').val();
        filter.technologies = $('#technologies-filter').val();
        
        filter.title = $('#title-filter').val();
        filter.gender = $('#gender-filter').val();
        filter.occupation = $('#occupation-filter').val();
        filter.city = $('#city-filter').val();
        console.log(filter);
        _.showLoader();
    }
    
    _.postListFecth = function(result){
        //Hide hilist if no pages found!
        if(result.totalPagesMatch==1){
            $('.hilist-footer').hide();
        }else{
            $('.hilist-footer').show();
        }
        
        _.hideLoader();
        _.findingMembers = false;
        
        //ON frist load
        $('.members-list-container').show();
        $('.loading-png-container').hide();
        $('members-find-btn').prop('disabled',false);
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
        $('.member-row').addClass('blink');
    }
    
    _.hideLoader = function(){
        $('.member-row').removeClass('blink');
    }
    
    

});
