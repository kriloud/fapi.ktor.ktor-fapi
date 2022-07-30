const requestURL = 'https://jsonplaceholder.typicode.com/todos/1'
const xhr = new XMLHttpRequest()
const test = 'my first JavaScript 0_o script?'
const x1 = 10
const x2 = 20
const x3 = x2 * x1
console.log(x1)
console.log(x2)
console.log(x3)
xhr.open('GET', requestURL)
xhr.onload = () => {
  console.log(xhr.response)
}
console.log(test)
xhr.send()