Hi.view(function (_) {
    _.nome = '';
    _.apelido = '';
    _.senha = '';
    _.senha_confirmation = '';



    _.$postLoad = function () {


        console.log("User: ");
        console.log(_.novo_user);


        console.log("Member: ");
        console.log(_.novo_member);
//        $('#birthdate').select2();
////        $('#birthdate').pickadate();
//        $('#city-filter').multiselect({enableFiltering: true, filterPlaceholder: 'Procure pela cidade...'});
//        $('#title-filter').multiselect({
//            enableFiltering: true,
//            includeSelectAllOption: true,
//            disableIfEmpty: true,
//            disabledText: 'Titulos existentes',
//            filterPlaceholder: 'Procure pelo Perfil...'
//        });
    }

    _.flushOnServer = function () {
        var can_save = true;
        if (_.senha != _.senha_confirmation && _.senha.length > 5) {
            can_save = false;
            alert("Senhas Diferentes");
        } else {
            _.novo_user.password = _.senha;
        }

        if (can_save) {
            _.novo_member.username = _.novo_user.username;
            _.novo_member.name = _.nome + " " + _.apelido;

//            UserFrontier.addUser(_.novo_user.username, _.novo_user.password, _.novo_user.member).try(function(result){
            UserFrontier.addUser(_.novo_user, _.novo_member).try(function (result) {
                
                alert(result);
                if (result) {
//                    Hi.redirect("user/profile?username=" + _.novo_user.username);
                    Hi.redirect("user/profile");
                }
            });
        } else {
            alert("User nao é valido");
        }

    }

});
