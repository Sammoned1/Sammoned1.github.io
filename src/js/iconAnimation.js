let services = document.querySelectorAll(".service");

services.forEach(function (el) {
	el.addEventListener("mouseenter", function (el) {
		let icon = document.querySelector(`#${el.target.id}>.Icon`);
		icon.classList.add('active');
	})
	el.addEventListener("mouseleave", function (el) {
		let icon = document.querySelector(`#${el.target.id}>.Icon`);
		if (icon.classList.contains('active'))
			icon.classList.remove('active');
	})
})
