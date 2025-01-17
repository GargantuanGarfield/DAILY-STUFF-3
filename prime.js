let form = document.forms[0]
        form.addEventListener('submit', (e)=>{
            e.preventDefault()
            let num = document.getElementById('num').value
            let count = 0
            for (let i=1; i<=num; i++) {
                console.log(num%i)
                if(count > 2 && num != i) {
                    break
                }else if (num%i==0) {
                    console.log(num%i)
                    count += 1
                }
            }
            if (count == 2) {
                window.alert("This a prime num :3:3:3:3")
            } else {
                window.alert("This is not a prime number :(")
                //location.reload()
            }
        })