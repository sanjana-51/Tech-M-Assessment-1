let timer;
let totalSeconds = 0;
let running = false;

const startButton = document.getElementById("start");
const pauseButton = document.getElementById("pause");
const resetButton = document.getElementById("reset");
const timerDisplay = document.getElementById("timer");

startButton.addEventListener("click", startTimer);
pauseButton.addEventListener("click", pauseTimer);
resetButton.addEventListener("click", resetTimer);

function startTimer() {
    if (!running) {
        let minutes = parseInt(document.getElementById("minutes").value) || 0;
        let seconds = parseInt(document.getElementById("seconds").value) || 0;
        totalSeconds = minutes * 60 + seconds;

        if (totalSeconds <= 0) {
            alert("Please enter a valid time.");
            return;
        }

        running = true;
        timer = setInterval(updateTimer, 1000);
    }
}

function pauseTimer() {
    clearInterval(timer);
    running = false;
}

function resetTimer() {
    clearInterval(timer);
    running = false;
    totalSeconds = 0;
    timerDisplay.innerText = "00:00";
}

function updateTimer() {
    if (totalSeconds <= 0) {
        clearInterval(timer);
        running = false;
        alert("Time's up!");
        return;
    }

    totalSeconds--;
    let minutes = Math.floor(totalSeconds / 60);
    let seconds = totalSeconds % 60;
    timerDisplay.innerText = `${String(minutes).padStart(2, '0')}:${String(seconds).padStart(2, '0')}`;
}
