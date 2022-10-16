/** @type {HTMLCanvasElement} */

// * Initialize
const canvas = document.getElementById("canvas");
const ctx = canvas.getContext("2d");

let canvasWidth = window.innerWidth;
let canvasHeight = window.innerHeight;

canvas.width = canvasWidth;
canvas.height = canvasHeight;

// * Objects
class Dot {
  constructor(x, y, r) {
    //create the dot
    const colors = ["#D65C9E", "#D68267", "#E6E87B", "#32967E", "#9451D6"];
    const randomColor = Math.floor(Math.random() * colors.length);
    const randomAcceleration = Math.ceil(Math.random() * 5);
    const trueOrFalse = Math.floor(Math.random() * 2);

    this.x = x + r * 2 > canvasWidth ? x - r : x || x < 0 ? x + r : r;
    this.y = y + r * 2 > canvasHeight ? y - r : y || y < 0 ? y + r : r;
    this.r = r;
    this.color = colors[randomColor];

    this.draw = () => {
      ctx.beginPath();
      ctx.arc(this.x, this.y, Math.abs(this.r), 0, Math.PI * 2, trueOrFalse);
      ctx.fillStyle = this.color;
      ctx.fill();
    };

    // move the dot
    if (trueOrFalse) {
      this.xVelocity = -Math.random() * randomAcceleration;
      this.yVelocity = -Math.random() * randomAcceleration;
    } else {
      this.xVelocity = Math.random() * randomAcceleration;
      this.yVelocity = Math.random() * randomAcceleration;
    }

    this.updatePosition = () => {
      this.draw();

      this.x += this.xVelocity;
      this.y += this.yVelocity;

      if (this.x + this.r > canvasWidth || this.x - this.r < 0) {
        this.xVelocity = -this.xVelocity;
      }
      if (this.y + this.r > canvasHeight || this.y - this.r < 0) {
        this.yVelocity = -this.yVelocity;
      }
    };
  }
}

const dots = [];

// * Functions
function drawingDots(w, h) {
  let maxRadius;
  let dividend;

  if (canvasWidth <= 428) {
    maxRadius = canvasWidth / 16;
    dividend = 8;
  } else if (canvasWidth >= 1920) {
    maxRadius = canvasWidth / 64;
    dividend = 16;
  } else {
    maxRadius = canvasWidth / 48;
    dividend = 12;
  }

  for (let i = 0; i <= Math.round(canvasWidth / dividend); i++) {
    const randomX = Math.round(Math.random() * w);
    const randomY = Math.round(Math.random() * h);
    const randomR = Math.round(Math.random() * maxRadius);

    dots.push(new Dot(randomX, randomY, randomR));
  }
}

drawingDots(canvasWidth, canvasHeight);

function hangingAround() {
  ctx.clearRect(0, 0, canvasWidth, canvasHeight);

  for (let i = 0; i < dots.length; i++) {
    dots[i].updatePosition();
  }
  window.requestAnimationFrame(hangingAround);
}

hangingAround();

// * Events
// Take out dot(s)
window.addEventListener("pointerdown", (e) => {
  if (
    e.pointerType === "mouse" ||
    e.pointerType === "touch" ||
    !e.pointerType === "pen"
  ) {
    for (i = 0; i < dots.length; i++) {
      const { x, y } = dots[i];
      const { offsetX, offsetY } = e;

      if (
        x - offsetX < 16 &&
        x - offsetX > -16 &&
        y - offsetY < 16 &&
        y - offsetY > -16
      ) {
        dots.splice(i, 1);
      }
    }
  }
});

// Responsible
window.addEventListener("resize", () => {
  canvasWidth = window.innerWidth;
  canvasHeight = window.innerHeight;

  canvas.width = canvasWidth;
  canvas.height = canvasHeight;

  ctx.clearRect(0, 0, canvasWidth, canvasHeight);
  dots.length = 0;
  drawingDots(canvasWidth, canvasHeight);
});