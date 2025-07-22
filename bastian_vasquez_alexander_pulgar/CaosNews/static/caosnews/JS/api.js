/*APi*/
fetch('https://mindicador.cl/api/dolar')
  .then(response => response.json())
  .then(data => {
    const valorDolar = data.serie[0].valor;
    const valorDolarElement = document.getElementById('valor-dolar');
    valorDolarElement.textContent = `El valor actual del dólar es: ${valorDolar}`;
  })
  .catch(error => console.log('Error:', error));

  fetch('https://mindicador.cl/api/uf')
  .then(response => response.json())
  .then(data => {
    const valorUF = data.serie[0].valor;
    const valorUFElement = document.getElementById('valor-uf');
    valorUFElement.textContent = `El valor actual de la UF es: ${valorUF}`;
  })
  .catch(error => console.log('Error:', error));


  fetch('https://mindicador.cl/api/euro')
  .then(response => response.json())
  .then(data => {
    const valorEuro = data.serie[0].valor;
    const valorEuroElement = document.getElementById('valor-euro');
    valorEuroElement.textContent = `El valor actual del Euro es: ${valorEuro}`;
  })

  fetch('https://mindicador.cl/api/utm')
  .then(response => response.json())
  .then(data => {
    const valorUTM = data.serie[0].valor;
    const valorUTMElement = document.getElementById('valor-utm');
    valorUTMElement.textContent = `El valor actual de la UTM es: ${valorUTM}`;
  })
  .catch(error => console.log('Error:', error));


  fetch('https://mindicador.cl/api/ipc')
  .then(response => response.json())
  .then(data => {
    const valorIPC = data.serie[0].valor;
    const valorIPCElement = document.getElementById('valor-ipc');
    valorIPCElement.textContent = `El valor actual del IPC es: ${valorIPC}`;
  })
  .catch(error => console.log('Error:', error));