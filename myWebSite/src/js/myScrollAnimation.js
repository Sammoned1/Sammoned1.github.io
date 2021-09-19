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
				if (pageYOffset != 0)
					animItem.classList.add("active");
			} else {
				if (!animItem.classList.contains('point')) {
					animItem.classList.remove('active');
				}
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

let title = document.querySelectorAll('.title')

window.addEventListener('scroll', function () {
	if (pageYOffset == 0) {
		title.forEach(function (el) {
			if (el.classList.contains('active')) {
				el.classList.remove('active');
			}
		})
	}
});

let angle = document.querySelector('.angle');

window.addEventListener('scroll', function () {
	if (pageYOffset == 0) {
		angle.classList.add('active');
	} else {
		if (angle.classList.contains('active'))
			angle.classList.remove('active');
	}
})
