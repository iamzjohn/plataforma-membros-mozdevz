Hi.view(function (_) {
    _.nome = '';
    _.apelido = '';
    _.senha = '';
    _.senha_confirmation = '';

    _.$postLoad = function () {

        $('#birthdate').pickadate({
            format: 'dd/mm/yyyy',
            max: new Date(),
            selectMonths: true,
            selectYears: 70
        });
        
        var cidades = sanitize_data(_.cities);
        $('#city-filter').multiselect('dataprovider', cidades);
        $('#city-filter').multiselect({
            enableFiltering: true, 
            filterPlaceholder: 'Procure pela cidade...', 
            disableIfEmpty: true
        });
        
        $('span.multiselect-native-select div').hide();
    }

    function sanitize_data(info) {
        var returned_data = [];
        info.forEach(function (item) {
            returned_data.push({
                label: item.name,
                value: item.id
            });
        });
        return returned_data;
    }

    _.flushOnServer = function () {

        var can_save = true;
        if (_.senha != _.senha_confirmation && _.senha.length > 5) {
            can_save = false;
            swal("Error!", "Senhas Diferentes!", "error");
        } else {
            _.novo_user.password = _.senha;

            if (can_save) {
                save();
            } else {
                swal("Error!", "User não é valido!", "error");
            }
        }
    }

    function save() {

        _.novo_member.username = _.novo_user.username;
        _.novo_member.name = _.nome + " " + _.apelido;
        var member_birthdate = $("#birthdate").val() + '';

        var extra_data = {
            birthdate: member_birthdate,
            city_id: _.city_id
        };

        UserFrontier.addUser(_.novo_user, _.novo_member, extra_data).try(function (result) {
            if (result) {
             swal("Parabens!", "User Registrado com Sucesso!!!", "success"); 
                UserFrontier.login(_.novo_user.username, _.novo_user.password).try(function (result) {
                    if (result) {
                        Hi.redirect("user/profile?username=" + _.novo_user.username);
                    } else {
                        swal("Error!", "Falha, por favor tente fazer o login!", "error");
                    }
                });
            } else {
                swal("Error!", "Falha, Erro no servidor a tentar gravar dados!", "error");
            }
        });
    }

});
