"use strict"

$(function () {
    let w = $(window);
    
    parallax(w.scrollTop());
    
    w.on('scroll', function () {
        let top = $(this).scrollTop();
        parallax(top)
    }); 
});

function parallax(top) {
    $('.content').css(
        'transform', 'translateY(' + (top / -4) + 'px)'
    );
}