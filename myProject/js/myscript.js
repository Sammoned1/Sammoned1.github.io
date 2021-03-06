$(document).ready(function () {
    $('select').val('choose');
	
	$("#phone").mask("+7(999) 999-9999");

	$('#form_1').submit(function(event){
		event.preventDefault();
		
		$.ajax({
			type: "POST",
			url: "php/mail.php",
			data: $(this).serialize()
		}).done(function(){
			$(this).find("input").val('');
			alert('Успешно отправлено!');
			$('form').trigger('reset');
			myModal.hide();
		});
		return false;
		
	});
	$('#form_2').submit(function(event){
		event.preventDefault();
		
		$.ajax({
			type: "POST",
			url: "php/mail_2.php",
			data: $(this).serialize()
		}).done(function(){
			$(this).find("input").val('');
			alert('Успешно отправлено x2!');
			$('form').trigger('reset');
		});
		return false;
		
	});
	

    //Подсветка элементов меню при прокрутке страницы
    $(window).scroll(function activeFunc() {
        let scrollDistance = $(window).scrollTop();
        $("section").each((i, el) => {
            if ($(el).offset().top - $("nav").outerHeight() <= scrollDistance + 200) {
                $("nav a").each((i, el) => {
                    if ($(el).hasClass("active")) {
                        $(el).removeClass("active");
                    }
                });
                $("nav li:eq(" + i + ")").find('a').addClass('active');
            }

        });
    });
    $('a[href^="#"]').click(function () {
        let valHref = $(this).attr("href");
        $('html, body').animate({
            scrollTop: $(valHref).offset().top - 60 + "px"
        });
    });

    //Бегущие цифры

    let options = {
        threshold: [0.5]
    };
    let elements = $('.count');
    let observer = new IntersectionObserver(numbers, options);
    elements.each((i, el) => {
        observer.observe(el);
    });

    function numbers(entry) {
        entry.forEach((change) => {
            if (change.isIntersecting) {
                function scrollNumbers() {
                    $(change.target).prop('Counter', 0).animate({
                        Counter: $(change.target).text()
                    }, {
                        duration: 800,
                        easing: 'swing',
                        step: function (now) {
                            $(change.target).text(Math.ceil(now));
                        }
                    })
                }
                scrollNumbers();
            }
        });
		
    }

    //Калькулятор

    $('.price_input').click(function () {
        let totalPrice = 0;
        let type = $('#typeList').val();
        let design = $('#designList').val();
        let adaptive = $('#adaptiveList').val();
        let totalTime = 0;
        if (type == 'choose') {
            totalPrice = 'Вы не выбрали тип сайта!';
            alert(totalPrice);
        } else if (type == 'help' || type == 'some') {
            totalPrice = 'Цена по договоренности';
            $('.deadline span').text(totalPrice);
            $('.deadline span').text(totalPrice);
            $('.price_input').removeClass('col-12').addClass('col-6');
            $('.send_request').removeClass('d-none').addClass('d-flex');
        } else {
            if (design == 'choose')
                design = 0;
            if (adaptive == 'choose')
                adaptive = 0;
            totalPrice = parseInt(type) + parseInt(design) + parseInt(adaptive);
            if (totalPrice >= 30000)
                totalTime = 10;
            else if (totalPrice >= 20000)
                totalTime = 7;
            else if (totalPrice >= 10000)
                totalTime = 5;
            else
                totalTime = 3;

            //не могу понять как сделать так, чтобы при нажатии на эту же кнопку каждый раз повторялась css анимация scrollPrice

            $('.deadline span').text(totalPrice);
            $('.price_input').removeClass('col-12').addClass('col-6');
            $('.send_request').removeClass('d-none').addClass('d-flex');
            if (totalTime >= 5)
                $('.cost span').text(totalTime + ' дней');
            else
                $('.cost span').text(totalTime + ' дня');


        }
    });


    //Слайдер кейсов

    $('.cases_background').slick({
        dots: true,
        infinite: true,
        speed: 500,
        fade: true,
        cssEase: 'linear'
    });

    $('.slideReviews').slick({
        dots: true,
    });

    $('.send_request').click(function () {
        $('html, body').animate({
            scrollTop: $('#contacts').offset().top - 60 + "px"
        });
    });

    //Появление услуг

    let elements_2 = $('.hidden');
    let observer_2 = new IntersectionObserver(show, options);
    elements_2.each((i, el) => {
        observer_2.observe(el);
    });

    function show(entry) {
        entry.forEach((change) => {
            if (change.isIntersecting) {
                change.target.classList.remove('hidden');
                change.target.classList.add('show');
            }
        });
    };

    //    Анимация описания обо мне

    let elements_3 = $('.description');
    let observer_3 = new IntersectionObserver(show_2, options);
    elements_3.each((i, el) => {
        observer_3.observe(el);
    });

    function show_2(entry) {
        entry.forEach((change) => {
            if (change.isIntersecting) {
                change.target.classList.add('showDescription');
            }
        });
    };


    //    Попап

    $(document).ready(function () {
        $('.image-link').magnificPopup({
            type: 'image'
        });
    });

    //    Таймер для модального окна

		var myModal = new bootstrap.Modal(document.getElementById('staticBackdrop'))
        setTimeout(function(){
            myModal.show();
        },50000);

//	Две кнопки в мэйне
	
    $('#button1').click(function () {
        $('html, body').animate({
            scrollTop: $('#about_me').offset().top - 60 + "px"
        });
    });
    $('#button2').click(function () {
        $('html, body').animate({
            scrollTop: $('#cases').offset().top - 60 + "px"
        });
    });

    

});
