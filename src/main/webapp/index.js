Hi.template({
    
    $onRedirectError : function(route,code){
        
        SP_redirectError(route,code);

    },

    //Template being initialized
    $init : function(){


    },
    
    logout : function(){
        
         SP_logout();
        
    },

    //when the first view is loaded
    $startup : function(){

        SP_startup();
        
    },

    //Pre process a view
    $onPreLoad : function(route,$scope,view){
        if(route.controller==="home"){
            $('.back-to-home-btn').hide();
        }else{
            $('.back-to-home-btn').show();
        }
        
        $('.requestLoader').fadeOut();
        
        this.currentController = route.controller;
        this.currentAction = route.action;
                
    },

    //After a view postLoad
    $onPostLoad : function(route,$scope){
          initApp();
    },

    //When a view is closed
    $onClose : function(route){
        

    },

    $onRedirectStart : function(route){
        $('.requestLoader').fadeIn();
        
    },

    $onRedirectFinish : function(route){
        
    },
    
    $frontiers:{

        //This handler is overridden by specific handlers
        catch : function(call,error){
            
            SP_frontiers_catch(call,error);
            
        }

    }



});