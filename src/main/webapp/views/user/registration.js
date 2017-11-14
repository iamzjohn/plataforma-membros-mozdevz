Hi.view(function (_) {
    _.nome = '';
    _.apelido = '';
    _.senha = '';
    _.senha_confirmation = '';



    _.$postLoad = function () {
//        $('#birthdate').select2();
        _.time = new Date(_.novo_member.birthday);
        _.novo_member.birthday = _.time.toLocaleDateString('en-GB');

        $('#birthdate').pickadate({
            format: 'dd/mm/yyyy'
        });
        $('#city-filter').multiselect({enableFiltering: true, filterPlaceholder: 'Procure pela cidade...'});
        $('#title-filter').multiselect({
            enableFiltering: true,
            includeSelectAllOption: true,
            disableIfEmpty: true,
            disabledText: 'Titulos existentes',
            filterPlaceholder: 'Procure pelo Perfil...'
        });

    }

    _.flushOnServer = function () {
        var can_save = true;
        if (_.senha != _.senha_confirmation && _.senha.length > 5) {
            can_save = false;
            alert("Senhas Diferentes");
        } else {
            _.novo_user.password = _.senha;
            
            if (can_save) {
                save();
            } else {
                alert("User nao é valido");
            }
        }



    }

    function save() {
        _.novo_member.username = _.novo_user.username;
        _.novo_member.name = _.nome + " " + _.apelido;
        _.novo_member.birthday = new Date(_.novo_member.birthday);

        UserFrontier.addUser(_.novo_user, _.novo_member).try(function (result) {
            alert(result);
            if (result) {
                alert("Membro Registrado com Sucesso");
                UserFrontier.login(_.novo_user.username, _.novo_user.password).try(function (result) {
                    if (result) {
                        Hi.redirect("user/profile");
                    } else {
                        alert("Falha, por favor tente fazer o login");
                    }
                });
                Hi.redirect("user/profile?username=" + _.novo_user.username);
            } else {
                alert("Falha ao tentar Gravar Usuario");
            }
        });
    }

});
