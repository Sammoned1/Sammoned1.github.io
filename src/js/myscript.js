
$(document).ready(function () {
    $(window).scroll(() => {
        let scrollDistance = $(window).scrollTop();
        $(".section").each((i, el) => {
            if ($(el).offset().top - $("nav").outerHeight() <= scrollDistance) {
                $("nav a").each((i, el) => {
                    if (($el).hasClass("active")){
                        $(el).removeClass("active");
                    }
                    
                });
                $("nav:eq("+ i +")").find('a').addClass('active');
            }
        });
    });
});

$('a[href^="#"]').click(function(){
    let valHref = $(this).attr("href");
    $('html, body').animate({scrollTop: $(valHref).offset().top - 30 + "px"});
});
