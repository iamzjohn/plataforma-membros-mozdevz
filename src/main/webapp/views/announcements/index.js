Hi.view(function(_){
    
    _.$postLoad = function(){
       initScroll();
       $(".styled, .multiselect-container input").uniform({
            radioClass: 'choice'
        });
    }

});
