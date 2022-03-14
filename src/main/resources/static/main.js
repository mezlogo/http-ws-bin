document.addEventListener('DOMContentLoaded', () => {
    const echoBtn = document.querySelector('#echo');
    const echoOutput = document.querySelector('#echo_output');
    const counterBtn = document.querySelector('#counter');
    const counterOutput = document.querySelector('#counter_output');

    echoBtn.addEventListener('click', async () => {
        const result = await fetch('/rest/echo');
        const text = await result.text();
        echoOutput.innerText = text;
    });

    counterBtn.addEventListener('click', async () => {
        const result = await fetch('/rest/session');
        const text = await result.text();
        counterOutput.innerText = text;
    });
});
