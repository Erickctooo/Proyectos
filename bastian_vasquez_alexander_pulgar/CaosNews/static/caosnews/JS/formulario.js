/*VALIDAR FORMULARIO*/
const form = document.getElementById('form');
  form.addEventListener('submit', function (event) {
    event.preventDefault(); // Evita el envío del formulario si no pasa la validación

    // Validar nombre, apellido y apellido materno (no permitir números)
    const nombreInput = form.elements.nombre;
    const apellidoInput = form.elements.apellido;
    const apellidoMaternoInput = form.elements.apellidomaterno;
    if (/\d/.test(nombreInput.value) || /\d/.test(apellidoInput.value) || /\d/.test(apellidoMaternoInput.value)) {
      alert('Los campos de nombre y apellido no pueden contener números.');
      return;
    }

    // Validar correo (exigir @)
    const correoInput = form.elements.correo;
    if (!/@/.test(correoInput.value)) {
      alert('Ingresa un correo válido.');
      return;
    }

    // Validar rut (al menos 8 dígitos con puntos y guión, y solo permitir la letra k después del guión)
    const rutInput = form.elements.rut;
    if (!/^(\d{1,2}\.)?(\d{3}\.)?\d{3}-[0-9kK]$/.test(rutInput.value)) {
      alert('Ingresa un RUT válido. ejemplo: 12.371.268-k');
      return;
    }

    // Validar género (debe ser seleccionado)
    const generoInputs = form.elements.genero;
    let generoSelected = false;
    for (let i = 0; i < generoInputs.length; i++) {
      if (generoInputs[i].checked) {
        generoSelected = true;
        break;
      }
    }
    if (!generoSelected) {
      alert('Selecciona un género.');
      return;
    }

    // Validar dirección (debe contener un #)
    const direccionInput = form.elements.direccion;
    if (!/#/.test(direccionInput.value)) {
      alert('Ingresa una dirección válida. ejemplo: Av. Esq. Blanca #501, Maipu');
      return;
    }

    // Validar teléfono (no permitir letras, al menos 9 dígitos)
    const telefonoInput = form.elements.telefono;
    if (/\D/.test(telefonoInput.value) || telefonoInput.value.length < 9) {
      alert('Ingresa un número de teléfono válido.');
      return;
    }

    // Si pasa la validación, puedes enviar el formulario o realizar otras acciones
    alert("Formulario enviado correctamente.");
    form.submit();
  });