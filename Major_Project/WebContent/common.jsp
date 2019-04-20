<script>
function getCook(user) 
  {
  // Get name followed by anything except a semicolon
  var cookiestring=RegExp(""+user+"[^;]+").exec(document.cookie);
  // Return everything after the equal sign, or an empty string if the cookie name not found
  return decodeURIComponent(!!cookiestring ? cookiestring.toString().replace(/^[^=]+./,"") : "");
  }

var cookieValue = getCook('user');


if(cookieValue.length==0 || cookieValue==null){
     history.pushState(null, null, null);
    window.addEventListener('popstate', function () {
        history.pushState(null, null, null);
    }); 
	window.location = "http://localhost:8080/Major_Project/";
    }


</script>

