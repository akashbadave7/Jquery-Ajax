$(document).ready(function()
		{
			
			$('#name').blur(function(){
			var name = $('#name').val();
			validateName(name);
         });
			
			/*$('#email').on('keypress keydown keyup',function(){*/
			$('#email').blur(function(){
            $('#email').filter(function(){
               var mail=$('#email').val();
               validateEmail(mail);
               checkISExit();
            });
        });
		$('#pass').blur(function(){
			var password = $('#pass').val();
			if(password.length<8)
				{
					$('.emsgPass').removeClass('hidden');
                 	$('.emsgPass').show();
				}
			else
				{
					$('.emsgPass').addClass('hidden');
				}
		});
		
		$('#cpass').blur(function(){
			var pass = $('#pass').val();
			var cpass = $('#cpass').val();
			if(pass != cpass)
				{
					$('.cpass').removeClass('hidden');
					$('.cpass').show();
				}
			else
				{
					$('.cpass').addClass('hidden');
				}
		});
		
		$('#mobile').blur(function(){
			var mob = $('#mobile').val();
			if( mob.length!=10)
				{
				 	$('.mobile').removeClass('hidden');
                 	$('.mobile').show();
				}
			else
				{
	               
					$('.mobile').addClass('hidden');
				}
		})
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
		function checkISExit()
		{
			var flag=true;
			$.ajax({
				type : "post",
				url : "EmailValidation",
				dataType :"json",
				async : false,
				data:{email:$('#email').val()},
				success : function(data) {
		            console.log(data.valid);
		            flag=data.valid;
		        },
		        error:function(error){
		            console.log(error);
		            console.log("Inside false");
		            

		        }
			});
			console.log(flag);
			if(flag==false){
				$('.emsgExit').removeClass('hidden');
         	   	$('.emsgExit').show();
			}
			else{
				$(".emsgExit").addClass('hidden');
			}
		}
		
		$("#button").click(function(event){
			var form_data=$("#register-form").serializeArray();
			var error_free=true;
			for (var input in form_data)
			{
				var element=$("#register-form_"+form_data[input]['name']);
				var valid=element.hasClass("valid");
				var error_element=$("span", element.parent());
				if (!valid){error_element.removeClass("error").addClass("error_show"); error_free=false;}
				else{error_element.removeClass("error_show").addClass("error");}
			}
			if (!error_free){
				event.preventDefault(); 
			}
			else{
				alert('No errors: Form will be submitted');
			}
		});
	});