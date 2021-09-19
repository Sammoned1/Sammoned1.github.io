let dropDownMenu = document.querySelector('.navTitle');
let navIcon = document.querySelector('.navIcon');

navIcon.addEventListener('click', function(){
	dropDownMenu.classList.toggle('active');
});

let links = document.querySelectorAll('.navTitle a');
links.forEach(function(el){
	el.addEventListener('click', function(){
		if (dropDownMenu.classList.contains('active'))
			dropDownMenu.classList.remove('active');
	});
});

let all = document.querySelectorAll('.all');
all.forEach(function(el){
	el.addEventListener('click', function(){
		if (dropDownMenu.classList.contains('active'))
			dropDownMenu.classList.remove('active');
	})
})
