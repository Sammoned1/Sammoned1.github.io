document.body.onload = function(){
	setTimeout(function(){
		var preloader = document.getElementById('preloader');
		var navigation = document.querySelectorAll('.menu li');
		var logo = document.querySelector('.logo');
		var title = document.querySelector('.title_container');
		if( !preloader.classList.contains('done')){
			preloader.classList.add('done');
			document.body.classList.add('loaded');
			navigation.forEach((el)=>{
				el.classList.add('loaded');
			})
			logo.classList.add('loaded');
			title.classList.add('loaded');
		}
		
	}, 1000)
}