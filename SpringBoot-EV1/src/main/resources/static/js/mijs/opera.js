//Declaracion de variables de java script

function resolver(){

    var precio = document.getElementById("precioProducto").value;

    var cantidad = document.getElementById("canProducto").value;

    var res = 0;
    
    res = parseFloat(precio) * parseFloat(cantidad);

    document.getElementById("totalProducto").value = res;
}

function enviar()
		{
			 var nombre = document.getElementById("nombre").value;
			 var correo = document.getElementById("correo").value;
			 var mensaje = document.getElementById("mensaje").value;
			 
			 localStorage.setItem("textNombre",nombre);
			 localStorage.setItem("textCorreo",correo);
			 localStorage.setItem("textMensaje",mensaje);
			 
			 return false;
		}