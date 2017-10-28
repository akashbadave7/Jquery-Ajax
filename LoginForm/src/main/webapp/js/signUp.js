$(document).ready(function()
		{
			
			$('#name').on('keypress keydown keyup',function(){
			var name = $('#name').val();
			validateName(name);
         });
			
		$('#email').focusout(function(){

            $('#email').filter(function(){
               var mail=$('#email').val();
               validateEmail(mail);
            
            })
        });
		function validateName(name)
		{
			var $regexname=/^[a-zA-Z]{3,}/;
			if (!name.match($regexname)) {
	              // there is a mismatch, hence show the error message
	                 $('.emsgName').removeClass('hidden');
	                 $('.emsgName').show();
	             }
	           else{
	                // else, do not display message
	                $('.emsgName').addClass('hidden');
	               }
		}
		function validateEmail(mail)
		{
			   var emailReg = /^([\w-\.]+@([\w-]+\.)+[\w-]{2,4})?$/;
               if( !emailReg.test( mail ) ) 
               {
            	   $('.emsgEmail').removeClass('hidden');
            	   $('.emsgEmail').show();
               } 
               else 
               {
            	$('.emsgEmail').addClass('hidden');
               }
		}
	});