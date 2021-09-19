let bg = document.querySelector('.parallax_bg');

parallax(pageYOffset);

window.addEventListener('scroll', function () {
	let top = pageYOffset;
	parallax(top);
})

function parallax(top) {
	bg.style.cssText = `
	transform: translateY(${top/2}px);
	`;
}
