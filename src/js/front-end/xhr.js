const requestURL = 'http://localhost:2096/user'
const xhr = new XMLHttpRequest()
xhr.open('GET', requestURL)
xhr.onload = () => {
  console.log(xhr.response)
}
xhr.send()