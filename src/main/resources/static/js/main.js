$(document).ready(function() {
    $(window).bind('keydown', function(event) {
        if (event.ctrlKey || event.metaKey) {
            if (String.fromCharCode(event.which).toLowerCase() == 's' ) {
                event.preventDefault();
                $('form').submit();
            }
        }
    });
});
