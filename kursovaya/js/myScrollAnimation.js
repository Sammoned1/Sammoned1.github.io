// Добавление классов при скролле

let animItems = document.querySelectorAll('.animate');
if (animItems.length > 0) {
	window.addEventListener('scroll', animOnScroll);

	function animOnScroll(params) {
		for (let i = 0; i < animItems.length; i++) {
			const animItem = animItems[i];
			const animtItemHeight = animItem.offsetHeight;
			const animItemOffset = offset(animItem).top;
			const animStart = 4;

			let animItemPoint = window.innerHeight - animtItemHeight / animStart;
			if (animtItemHeight > window.innerHeight) {
				let animItemPoint = window.innerHeight - window.innerHeight / animStart;
			}
			if ((pageYOffset > animItemOffset - animItemPoint) && pageYOffset < (animItemOffset + animtItemHeight)) {
				animItem.classList.add("active");
			} else {
				if (!animItem.classList.contains('list'))
					animItem.classList.remove('active');
			}
		}
	}
	animOnScroll();
}

function offset(el) {
	const rect = el.getBoundingClientRect(),
		scrollLeft = window.pageXOffset || document.documentElement.scrollLeft,
		scrollTop = window.pageYOffset || document.documentElement.scrollTop;
	return {
		top: rect.top + scrollTop,
		left: rect.left + scrollLeft
	}
}

// Анимация навбара

let navBar = document.querySelector('nav');
let mainBlock = document.querySelector('.main');
let dropDownMenu2 = document.querySelector('.navTitle')

window.addEventListener('scroll', animNavBar);

function animNavBar() {
	const navBarHeight = navBar.offsetHeight;
	const mainHeight = mainBlock.offsetHeight;
	if (pageYOffset > (mainHeight - window.innerHeight)) {
		navBar.classList.add('active');
	} else {
		navBar.classList.remove('active');
		if (dropDownMenu2.classList.contains('active')) {
			dropDownMenu2.classList.remove('active');
		}
	}
}
animNavBar();

// Плавный скролл

$('a[href^="#"]').click(function () {
	let valHref = $(this).attr("href");
	if (window.innerWidth > 482) {
		$('html, body').animate({
			scrollTop: $(valHref).offset().top - 80 + "px"
		});
	} else {
		$('html, body').animate({
			scrollTop: $(valHref).offset().top - 60 + "px"
		});
	}

});
