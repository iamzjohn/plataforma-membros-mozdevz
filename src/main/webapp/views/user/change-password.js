Hi.view(function(_){
    
    _.$postLoad = function(){
       
    }
    
    _.changePassword = function(){
        
        if(_.newPassword != _.newPasswordConfirm){
            alert('passwords do not confirm!');
        }
        
        var constraints = {
        username: {
          presence: true,
          exclusion: {
            within: ["nicklas"],
            message: "'%{value}' is not allowed"
          }
        },
        password: {
          presence: true,
          length: {
            minimum: 6,
            message: "must be at least 6 characters"
          }
        }
      };

      _.validationErrors = validate({password: "bad"}, constraints);
        
    }

});
