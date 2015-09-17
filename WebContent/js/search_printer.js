/*---- диапазон для цены ----*/          
            $(function() {
            $( ".slider-range-prise" ).slider({
              range: true,
              min: 0,
              max: 100000,
              values: [ 10000, 60000 ],
              slide: function( event, ui ) {
                $( ".amount-prise" ).val( "$" + ui.values[ 0 ] + " - $" + ui.values[ 1 ] );
              }
            });
            $( ".amount-prise" ).val( "$" + $( ".slider-range-prise" ).slider( "values", 0 ) +
              " - $" + $( ".slider-range-prise" ).slider( "values", 1 ) );
          });
/*---- диапазон для скорости печати----*/ 
          $(function() {
            $( ".slider-range-speed-print" ).slider({
              range: true,
              min: 1,
              max: 300,
              values: [ 50, 150 ],
              slide: function( event, ui ) {
                $( ".amount-speed-print" ).val( ui.values[ 0 ] +  " м.кв./ч." + " - " + ui.values[ 1 ] + " м.кв./ч." );
              }
            });
            $( ".amount-speed-print" ).val($( ".slider-range-speed-print" ).slider( "values", 0 ) +  " м.кв./ч." +
              " - " + $( ".slider-range-speed-print" ).slider( "values", 1 ) + " м.кв./ч." );
          });
/*---- диапазон для максимальной толщины носителя ----*/
          $(function() {
            $( ".slider-range-maximum_media_thickness" ).slider({
              range: true,
              min: 1,
              max: 500,
              values: [ 150, 400 ],
              slide: function( event, ui ) {
                $( ".amount-maximum_media_thickness" ).val( ui.values[ 0 ] +  " мм" + " - " + ui.values[ 1 ] + " мм" );
              }
            });
            $( ".amount-maximum_media_thickness" ).val($( ".slider-range-maximum_media_thickness" ).slider( "values", 0 ) +  " мм" +
              " - " + $( ".slider-range-maximum_media_thickness" ).slider( "values", 1 ) + " мм" );
          });
/*--- для максимального веса носителя ---*/
          $(function() {
            $( ".slider-range-maximum_weight_of_vehicle" ).slider({
              range: true,
              min: 5,
              max: 500,
              values: [ 150, 300 ],
              slide: function( event, ui ) {
                $( ".amount-maximum_weight_of_vehicle" ).val( ui.values[ 0 ] +  " кг" + " - " + ui.values[ 1 ] + " кг" );
              }
            });
            $( ".amount-maximum_weight_of_vehicle" ).val($( ".slider-range-maximum_weight_of_vehicle" ).slider( "values", 0 ) +  " кг" +
              " - " + $( ".slider-range-maximum_weight_of_vehicle" ).slider( "values", 1 ) + " кг" );
          });
/*--- для максимальной потребляемой мощности ----*/
          $(function() {
            $( ".slider-range-max_power_consumption" ).slider({
              range: true,
              min: 0.1,
              max: 100.1,
              values: [ 20, 50 ],
              slide: function( event, ui ) {
                $( ".amount-max_power_consumption" ).val( ui.values[ 0 ] +  " кВт" + " - " + ui.values[ 1 ] + " кВт" );
              }
            });
            $( ".amount-max_power_consumption" ).val($( ".slider-range-max_power_consumption" ).slider( "values", 0 ) +  " кВт" +
              " - " + $( ".slider-range-max_power_consumption" ).slider( "values", 1 ) + " кВт" );
          });
/*--- для веса ----*/
          $(function() {
            $( ".slider-range-weight" ).slider({
              range: true,
              min: 50,
              max: 5000,
              values: [ 1000, 4000 ],
              slide: function( event, ui ) {
                $( ".amount-weight" ).val( ui.values[ 0 ] +  " кг" + " - " + ui.values[ 1 ] + " кг" );
              }
            });
            $( ".amount-weight" ).val($( ".slider-range-weight" ).slider( "values", 0 ) +  " кг" +
              " - " + $( ".slider-range-weight" ).slider( "values", 1 ) + " кг" );
          });
/*--- для ширины ---*/
          $(function() {
            $( ".slider-range-width" ).slider({
              range: true,
              min: 0.1,
              max: 10.1,
              values: [ 3, 7 ],
              slide: function( event, ui ) {
                $( ".amount-width" ).val( ui.values[ 0 ] +  " м" + " - " + ui.values[ 1 ] + " м" );
              }
            });
            $( ".amount-width" ).val($( ".slider-range-width" ).slider( "values", 0 ) +  " м" +
              " - " + $( ".slider-range-width" ).slider( "values", 1 ) + " м" );
          });
/*--- для высоты ---*/
          $(function() {
            $( ".slider-range-heigth" ).slider({
              range: true,
              min: 0.1,
              max: 10.1,
              values: [ 3, 7 ],
              slide: function( event, ui ) {
                $( ".amount-heigth" ).val( ui.values[ 0 ] +  " м" + " - " + ui.values[ 1 ] + " м" );
              }
            });
            $( ".amount-heigth" ).val($( ".slider-range-heigth" ).slider( "values", 0 ) +  " м" +
              " - " + $( ".slider-range-heigth" ).slider( "values", 1 ) + " м" );
          });
/*--- для глубины ---*/
          $(function() {
            $( ".slider-range-depth" ).slider({
              range: true,
              min: 0.1,
              max: 10.1,
              values: [ 3, 7 ],
              slide: function( event, ui ) {
                $( ".amount-depth" ).val( ui.values[ 0 ] +  " м" + " - " + ui.values[ 1 ] + " м" );
              }
            });
            $( ".amount-depth" ).val($( ".slider-range-depth" ).slider( "values", 0 ) +  " м" +
              " - " + $( ".slider-range-depth" ).slider( "values", 1 ) + " м" );
          });

/*-- реализация подпунктов ширины в виде вкладок --*/
        (function($){				
            jQuery.fn.lightTabs = function(options){
                var createTabs = function(){
                    tabs = this;
                    i = 0;

                    showPage = function(i){
                        $(tabs).children("div").children("div").hide();
                        $(tabs).children("div").children("div").eq(i).show();
                        $(tabs).children("ul").children("li").removeClass("active");
                        $(tabs).children("ul").children("li").eq(i).addClass("active");
                    }

                    showPage(0);				

                    $(tabs).children("ul").children("li").each(function(index, element){
                        $(element).attr("data-page", i);
                        i++;                        
                    });

                    $(tabs).children("ul").children("li").click(function(){
                        showPage(parseInt($(this).attr("data-page")));
                    });				
                };		
                return this.each(createTabs);
            };	
        })(jQuery);
        $(document).ready(function(){
            $("#tabs").lightTabs();
        });
/*--- реализация выпадающих подпунктов ---*/
        $( function(){
            $(".block_title").click(function(){
                var check = $(this).parent('.search_criteria').find(".check_boxes");
                var check_point = $(this).find("i");
                if (check.css('display') == 'none') {
                    check.css('display', 'block');
                    check_point.addClass('opened');
                }else{
                    check.css('display', 'none');
                    check_point.css('color', 'green');
                    check_point.removeClass('opened');
                }
            });
        } );