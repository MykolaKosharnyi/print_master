jQuery(document).ready(function(){
	
/*--------------------------------------- for first block -----------------------------------------------------------*/
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
						.css({'left': 21});
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
					.animate({left: 21}, 500);

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
						.css({'left': 21});
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

	/* ������������� ������� �������� 1 */
	htmSlider1();
/*--------------------------------------- for second block -----------------------------------------------------------*/
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
						.css({'left': 21});
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
					.animate({left: 21}, 500);

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
						.css({'left': 21});
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

	/* ������������� ������� �������� 2 */
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
						.css({'left': 21});
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
					.animate({left: 21}, 500);

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
						.css({'left': 21});
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

	/* ������������� ������� �������� 3 */
	htmSlider3();
/*--------------------------------------- for forth block -----------------------------------------------------------*/
		function htmSlider4(){
		/* ������� ��������� ���������� */

		/* ������� �������� */
		var slideWrap4 = jQuery('.slide-wrap4');
		/* ������ �� ���������� ���������� ����� */
		var nextLink4 = jQuery('.next-slide4');
		var prevLink4 = jQuery('.prev-slide4');

		var playLink4 = jQuery('.auto4');
		
		var is_animate4 = false;
		
		/* ������ ������ � ��������� */
		var slideWidth4 = jQuery('.slide-item4').outerWidth();
		
		/* �������� �������� */
		var newLeftPos4 = slideWrap4.position().left - slideWidth4;
		
		/* ���� �� ������ �� ��������� ����� */
		nextLink4.click(function(){
			if(!slideWrap4.is(':animated')) {
	
				slideWrap4.animate({left: newLeftPos4}, 500, function(){
					slideWrap4
						.find('.slide-item4:first')
						.appendTo(slideWrap4)
						.parent()
						.css({'left': 21});
				});

			}
		});

		/* ���� �� ������ �� ����������� ����� */
		prevLink4.click(function(){
			if(!slideWrap4.is(':animated')) {
			
				slideWrap4
					.css({'left': newLeftPos4})
					.find('.slide-item4:last')
					.prependTo(slideWrap4)
					.parent()
					.animate({left: 21}, 500);

			}
		});
		
		
		/* ������� �������������� ��������� �������� */
		function autoplay(){
			if(!is_animate4){
				is_animate4 = true;
				slideWrap4.animate({left: newLeftPos4}, 500, function(){
					slideWrap4
						.find('.slide-item4:first')
						.appendTo(slideWrap4)
						.parent()
						.css({'left': 21});
					is_animate4 = false;
				});
			}
		}
		
		/* ����� �� ������� �����/����� */
		playLink4.click(function(){
			if(playLink4.hasClass('play4')){
				playLink4.removeClass('play4').addClass('pause4');
				jQuery('.navy4').addClass('disable4');
				timer = setInterval(autoplay, 500);
			} else {
				playLink4.removeClass('pause4').addClass('play4');
				jQuery('.navy4').removeClass('disable4');
				clearInterval(timer);
			}
		});

	}

	/* ������������� ������� �������� 4 */
	htmSlider4();
/*--------------------------------------- for fifth block -----------------------------------------------------------*/
		function htmSlider5(){
		/* ������� ��������� ���������� */

		/* ������� �������� */
		var slideWrap5 = jQuery('.slide-wrap5');
		/* ������ �� ���������� ���������� ����� */
		var nextLink5 = jQuery('.next-slide5');
		var prevLink5 = jQuery('.prev-slide5');

		var playLink5 = jQuery('.auto5');
		
		var is_animate5 = false;
		
		/* ������ ������ � ��������� */
		var slideWidth5 = jQuery('.slide-item5').outerWidth();
		
		/* �������� �������� */
		var newLeftPos5 = slideWrap5.position().left - slideWidth5;
		
		/* ���� �� ������ �� ��������� ����� */
		nextLink5.click(function(){
			if(!slideWrap5.is(':animated')) {
	
				slideWrap5.animate({left: newLeftPos5}, 500, function(){
					slideWrap5
						.find('.slide-item5:first')
						.appendTo(slideWrap5)
						.parent()
						.css({'left': 21});
				});

			}
		});

		/* ���� �� ������ �� ����������� ����� */
		prevLink5.click(function(){
			if(!slideWrap5.is(':animated')) {
			
				slideWrap5
					.css({'left': newLeftPos5})
					.find('.slide-item5:last')
					.prependTo(slideWrap5)
					.parent()
					.animate({left: 21}, 500);

			}
		});
		
		
		/* ������� �������������� ��������� �������� */
		function autoplay(){
			if(!is_animate5){
				is_animate5 = true;
				slideWrap5.animate({left: newLeftPos5}, 500, function(){
					slideWrap5
						.find('.slide-item5:first')
						.appendTo(slideWrap5)
						.parent()
						.css({'left': 21});
					is_animate5 = false;
				});
			}
		}
		
		/* ����� �� ������� �����/����� */
		playLink5.click(function(){
			if(playLink5.hasClass('play5')){
				playLink5.removeClass('play5').addClass('pause5');
				jQuery('.navy5').addClass('disable5');
				timer = setInterval(autoplay, 500);
			} else {
				playLink5.removeClass('pause5').addClass('play5');
				jQuery('.navy5').removeClass('disable5');
				clearInterval(timer);
			}
		});

	}

	/* ������������� ������� �������� 5 */
	htmSlider5();
/*--------------------------------------- for sixth block -----------------------------------------------------------*/
		function htmSlider6(){
		/* ������� ��������� ���������� */

		/* ������� �������� */
		var slideWrap6 = jQuery('.slide-wrap6');
		/* ������ �� ���������� ���������� ����� */
		var nextLink6 = jQuery('.next-slide6');
		var prevLink6 = jQuery('.prev-slide6');

		var playLink6 = jQuery('.auto6');
		
		var is_animate6 = false;
		
		/* ������ ������ � ��������� */
		var slideWidth6 = jQuery('.slide-item6').outerWidth();
		
		/* �������� �������� */
		var newLeftPos6 = slideWrap6.position().left - slideWidth6;
		
		/* ���� �� ������ �� ��������� ����� */
		nextLink6.click(function(){
			if(!slideWrap6.is(':animated')) {
	
				slideWrap6.animate({left: newLeftPos6}, 500, function(){
					slideWrap6
						.find('.slide-item6:first')
						.appendTo(slideWrap6)
						.parent()
						.css({'left': 21});
				});

			}
		});

		/* ���� �� ������ �� ����������� ����� */
		prevLink6.click(function(){
			if(!slideWrap6.is(':animated')) {
			
				slideWrap6
					.css({'left': newLeftPos6})
					.find('.slide-item6:last')
					.prependTo(slideWrap6)
					.parent()
					.animate({left: 21}, 500);

			}
		});
		
		
		/* ������� �������������� ��������� �������� */
		function autoplay(){
			if(!is_animate6){
				is_animate6 = true;
				slideWrap6.animate({left: newLeftPos6}, 500, function(){
					slideWrap6
						.find('.slide-item6:first')
						.appendTo(slideWrap6)
						.parent()
						.css({'left': 21});
					is_animate6 = false;
				});
			}
		}
		
		/* ����� �� ������� �����/����� */
		playLink6.click(function(){
			if(playLink6.hasClass('play6')){
				playLink6.removeClass('play6').addClass('pause6');
				jQuery('.navy6').addClass('disable6');
				timer = setInterval(autoplay, 500);
			} else {
				playLink6.removeClass('pause6').addClass('play6');
				jQuery('.navy6').removeClass('disable6');
				clearInterval(timer);
			}
		});

	}

	/* ������������� ������� �������� 6 */
	htmSlider6();
/*--------------------------------------- for seventh block -----------------------------------------------------------*/
		function htmSlider7(){
		/* ������� ��������� ���������� */

		/* ������� �������� */
		var slideWrap7 = jQuery('.slide-wrap7');
		/* ������ �� ���������� ���������� ����� */
		var nextLink7 = jQuery('.next-slide7');
		var prevLink7 = jQuery('.prev-slide7');

		var playLink7 = jQuery('.auto7');
		
		var is_animate7 = false;
		
		/* ������ ������ � ��������� */
		var slideWidth7 = jQuery('.slide-item7').outerWidth();
		
		/* �������� �������� */
		var newLeftPos7 = slideWrap7.position().left - slideWidth7;
		
		/* ���� �� ������ �� ��������� ����� */
		nextLink7.click(function(){
			if(!slideWrap7.is(':animated')) {
	
				slideWrap7.animate({left: newLeftPos7}, 500, function(){
					slideWrap7
						.find('.slide-item7:first')
						.appendTo(slideWrap7)
						.parent()
						.css({'left': 21});
				});

			}
		});

		/* ���� �� ������ �� ����������� ����� */
		prevLink7.click(function(){
			if(!slideWrap7.is(':animated')) {
			
				slideWrap7
					.css({'left': newLeftPos7})
					.find('.slide-item7:last')
					.prependTo(slideWrap7)
					.parent()
					.animate({left: 21}, 500);

			}
		});
		
		
		/* ������� �������������� ��������� �������� */
		function autoplay(){
			if(!is_animate7){
				is_animate7 = true;
				slideWrap7.animate({left: newLeftPos7}, 500, function(){
					slideWrap7
						.find('.slide-item7:first')
						.appendTo(slideWrap7)
						.parent()
						.css({'left': 21});
					is_animate7 = false;
				});
			}
		}
		
		/* ����� �� ������� �����/����� */
		playLink7.click(function(){
			if(playLink7.hasClass('play7')){
				playLink7.removeClass('play7').addClass('pause7');
				jQuery('.navy7').addClass('disable7');
				timer = setInterval(autoplay, 500);
			} else {
				playLink7.removeClass('pause7').addClass('play7');
				jQuery('.navy7').removeClass('disable7');
				clearInterval(timer);
			}
		});

	}

	/* ������������� ������� �������� 7 */
	htmSlider7();
});