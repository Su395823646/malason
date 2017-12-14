

// $.test = {
//     send : function (){
//         debugger;
//         $.ajax({
//             url: getContextPath() + "/user/send",
//             type: "get",
//             success: function (response) {
//                 if (response.success !== true) {
//                     $.utils.alertError(response.errorMessage);
//                 } else {
//                     $("#result").html(response.data.obj);
//
//                 }
//
//             }
//
//         });
//     }
// }

function send() {
    $.ajax({
        url: getContextPath() + "/user/send",
        type: "get",
        success: function (response) {
            if (response.success !== true) {
                $.utils.alertError(response.errorMessage);
            } else {
                $("#result").html(response.data.obj);

            }

        }

    });
}