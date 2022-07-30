const requestURL = 'https://jsonplaceholder.typicode.com/todos/1'
const xhr = new XMLHttpRequest()
xhr.open('GET', requestURL)
xhr.onload = () => {
  console.log(xhr.response)
}
xhr.send()