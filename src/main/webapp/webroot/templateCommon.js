function SP_logout() {
    $('.requestLoader').fadeIn();

    UserFrontier.logout().try(function () {
        location.reload();
    }).catch(function () {
        swal({
            title: "Opss", text: "Logout não efectuado!", type: "error", showCancelButton: false, confirmButtonColor: "#DD6B55", confirmButtonText: "OK", closeOnConfirm: false}, function () {
            //document.location.reload();
        });
    }).finally(function () {
        $('.requestLoader').fadeOut();
    });
}

function SP_redirectError(route, code) {
    if (code) {
        swal({title: "Opss", text: "Algo aconteceu de errado! Código: " + code, type: "error", showCancelButton: false, confirmButtonColor: "#DD6B55", confirmButtonText: "OK", closeOnConfirm: false}, function () {
            document.location.reload();
        });
    }
}

function SP_startup() {
    $('.requestLoader').fadeOut();
    $('.sp-body').fadeIn();

}

function SP_login(app) {
    var data;
    UserFrontier.getStateForAuth(app).try(function (result) {
        data = result;        
    });
}

function SP_frontiers_catch(call, error) {

    swal({
        title: "Operação Recusada!",
        text: "Código " + error + "!",
        type: "error",
        showCancelButton: true,
        confirmButtonColor: "#42a5f5",
        confirmButtonText: "Recarregar a pagina!",
        cancelButtonText: "Tentar novamente!",
        closeOnConfirm: false,
        closeOnCancel: true},
            function (isConfirm) {
                if (isConfirm) {
                    document.location.reload();
                }
            });

}