jQuery(document).ready(function(){
	function htmSlider(){
		/* ������� ��������� ���������� */

		/* ������� �������� */
		var slideWrap = jQuery('.slide-wrap');
		/* ������ �� ���������� ���������� ����� */
		var nextLink = jQuery('.next-slide');
		var prevLink = jQuery('.prev-slide');

		var playLink = jQuery('.auto');
		
		var is_animate = false;
		
		/* ������ ������ � ��������� */
		var slideWidth = jQuery('.slide-item').outerWidth();
		
		/* �������� �������� */
		var newLeftPos = slideWrap.position().left - slideWidth;
		
		/* ���� �� ������ �� ��������� ����� */
		nextLink.click(function(){
			if(!slideWrap.is(':animated')) {
	
				slideWrap.animate({left: newLeftPos}, 500, function(){
					slideWrap
						.find('.slide-item:first')
						.appendTo(slideWrap)
						.parent()
						.css({'left': 32});
				});

			}
		});

		/* ���� �� ������ �� ����������� ����� */
		prevLink.click(function(){
			if(!slideWrap.is(':animated')) {
			
				slideWrap
					.css({'left': newLeftPos})
					.find('.slide-item:last')
					.prependTo(slideWrap)
					.parent()
					.animate({left: 32}, 500);

			}
		});
		
		
		/* ������� �������������� ��������� �������� */
		function autoplay(){
			if(!is_animate){
				is_animate = true;
				slideWrap.animate({left: newLeftPos}, 500, function(){
					slideWrap
						.find('.slide-item:first')
						.appendTo(slideWrap)
						.parent()
						.css({'left': 32});
					is_animate = false;
				});
			}
		}
		
		/* ����� �� ������� �����/����� */
		playLink.click(function(){
			if(playLink.hasClass('play')){
				playLink.removeClass('play').addClass('pause');
				jQuery('.navy').addClass('disable');
				timer = setInterval(autoplay, 500);
			} else {
				playLink.removeClass('pause').addClass('play');
				jQuery('.navy').removeClass('disable');
				clearInterval(timer);
			}
		});

	}
	htmSlider();

/*--------------------------------------- for second block -----------------------------------------------------------*/
		function htmSlider1(){
		/* ������� ��������� ���������� */

		/* ������� �������� */
		var slideWrap1 = jQuery('.slide-wrap1');
		/* ������ �� ���������� ���������� ����� */
		var nextLink1 = jQuery('.next-slide1');
		var prevLink1 = jQuery('.prev-slide1');

		var playLink1 = jQuery('.auto1');
		
		var is_animate1 = false;
		
		/* ������ ������ � ��������� */
		var slideWidth1 = jQuery('.slide-item1').outerWidth();
		
		/* �������� �������� */
		var newLeftPos1 = slideWrap1.position().left - slideWidth1;
		
		/* ���� �� ������ �� ��������� ����� */
		nextLink1.click(function(){
			if(!slideWrap1.is(':animated')) {
	
				slideWrap1.animate({left: newLeftPos1}, 500, function(){
					slideWrap1
						.find('.slide-item1:first')
						.appendTo(slideWrap1)
						.parent()
						.css({'left': 32});
				});

			}
		});

		/* ���� �� ������ �� ����������� ����� */
		prevLink1.click(function(){
			if(!slideWrap1.is(':animated')) {
			
				slideWrap1
					.css({'left': newLeftPos1})
					.find('.slide-item1:last')
					.prependTo(slideWrap1)
					.parent()
					.animate({left: 32}, 500);

			}
		});
		
		
		/* ������� �������������� ��������� �������� */
		function autoplay(){
			if(!is_animate1){
				is_animate1 = true;
				slideWrap1.animate({left: newLeftPos1}, 500, function(){
					slideWrap1
						.find('.slide-item1:first')
						.appendTo(slideWrap1)
						.parent()
						.css({'left': 32});
					is_animate1 = false;
				});
			}
		}
		
		/* ����� �� ������� �����/����� */
		playLink1.click(function(){
			if(playLink1.hasClass('play1')){
				playLink1.removeClass('play1').addClass('pause1');
				jQuery('.navy1').addClass('disable1');
				timer = setInterval(autoplay, 500);
			} else {
				playLink1.removeClass('pause1').addClass('play1');
				jQuery('.navy1').removeClass('disable1');
				clearInterval(timer);
			}
		});

	}

	/* ������������� ������� �������� 2 */
	htmSlider1();
/*--------------------------------------- for third block -----------------------------------------------------------*/
		function htmSlider2(){
		/* ������� ��������� ���������� */

		/* ������� �������� */
		var slideWrap2 = jQuery('.slide-wrap2');
		/* ������ �� ���������� ���������� ����� */
		var nextLink2 = jQuery('.next-slide2');
		var prevLink2 = jQuery('.prev-slide2');

		var playLink2 = jQuery('.auto2');
		
		var is_animate2 = false;
		
		/* ������ ������ � ��������� */
		var slideWidth2 = jQuery('.slide-item2').outerWidth();
		
		/* �������� �������� */
		var newLeftPos2 = slideWrap2.position().left - slideWidth2;
		
		/* ���� �� ������ �� ��������� ����� */
		nextLink2.click(function(){
			if(!slideWrap2.is(':animated')) {
	
				slideWrap2.animate({left: newLeftPos2}, 500, function(){
					slideWrap2
						.find('.slide-item2:first')
						.appendTo(slideWrap2)
						.parent()
						.css({'left': 32});
				});

			}
		});

		/* ���� �� ������ �� ����������� ����� */
		prevLink2.click(function(){
			if(!slideWrap2.is(':animated')) {
			
				slideWrap2
					.css({'left': newLeftPos2})
					.find('.slide-item2:last')
					.prependTo(slideWrap2)
					.parent()
					.animate({left: 32}, 500);

			}
		});
		
		
		/* ������� �������������� ��������� �������� */
		function autoplay(){
			if(!is_animate2){
				is_animate2 = true;
				slideWrap2.animate({left: newLeftPos2}, 500, function(){
					slideWrap2
						.find('.slide-item2:first')
						.appendTo(slideWrap2)
						.parent()
						.css({'left': 32});
					is_animate2 = false;
				});
			}
		}
		
		/* ����� �� ������� �����/����� */
		playLink2.click(function(){
			if(playLink2.hasClass('play2')){
				playLink2.removeClass('play2').addClass('pause2');
				jQuery('.navy2').addClass('disable2');
				timer = setInterval(autoplay, 500);
			} else {
				playLink2.removeClass('pause2').addClass('play2');
				jQuery('.navy2').removeClass('disable2');
				clearInterval(timer);
			}
		});

	}

	/* ������������� ������� �������� 3 */
	htmSlider2();

/*--------------------------------------- for third block -----------------------------------------------------------*/
		function htmSlider3(){
		/* ������� ��������� ���������� */

		/* ������� �������� */
		var slideWrap3 = jQuery('.slide-wrap3');
		/* ������ �� ���������� ���������� ����� */
		var nextLink3 = jQuery('.next-slide3');
		var prevLink3 = jQuery('.prev-slide3');

		var playLink3 = jQuery('.auto3');
		
		var is_animate3 = false;
		
		/* ������ ������ � ��������� */
		var slideWidth3 = jQuery('.slide-item3').outerWidth();
		
		/* �������� �������� */
		var newLeftPos3 = slideWrap3.position().left - slideWidth3;
		
		/* ���� �� ������ �� ��������� ����� */
		nextLink3.click(function(){
			if(!slideWrap3.is(':animated')) {
	
				slideWrap3.animate({left: newLeftPos3}, 500, function(){
					slideWrap3
						.find('.slide-item3:first')
						.appendTo(slideWrap3)
						.parent()
						.css({'left': 32});
				});

			}
		});

		/* ���� �� ������ �� ����������� ����� */
		prevLink3.click(function(){
			if(!slideWrap3.is(':animated')) {
			
				slideWrap3
					.css({'left': newLeftPos3})
					.find('.slide-item3:last')
					.prependTo(slideWrap3)
					.parent()
					.animate({left: 32}, 500);

			}
		});
		
		
		/* ������� �������������� ��������� �������� */
		function autoplay(){
			if(!is_animate3){
				is_animate3 = true;
				slideWrap3.animate({left: newLeftPos3}, 500, function(){
					slideWrap3
						.find('.slide-item3:first')
						.appendTo(slideWrap3)
						.parent()
						.css({'left': 32});
					is_animate3 = false;
				});
			}
		}
		
		/* ����� �� ������� �����/����� */
		playLink3.click(function(){
			if(playLink3.hasClass('play3')){
				playLink3.removeClass('play3').addClass('pause3');
				jQuery('.navy3').addClass('disable3');
				timer = setInterval(autoplay, 500);
			} else {
				playLink3.removeClass('pause3').addClass('play3');
				jQuery('.navy3').removeClass('disable3');
				clearInterval(timer);
			}
		});

	}

	/* ������������� ������� �������� 4 */
	htmSlider3();
});