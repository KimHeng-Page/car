import http from 'http';

const target = "http://example.com";
for(let i= 0; i<100; i++) {
        http.get(target, res =>{
            console.log(`Request ${i+1}: Status Code: ${res.statusCode}`);
        });
    }