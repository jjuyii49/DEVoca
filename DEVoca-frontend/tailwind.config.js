/** @type {import('tailwindcss').Config} */

const defaultTheme = require('tailwindcss/defaultTheme')

export default {
  content: [
    "./index.html",
    "./src/**/*.{vue,js,ts,jsx,tsx}",
  ],
  theme: {
    extend: {
      fontFamily: {
        sans : ['GmarketSansMedium', ...defaultTheme.fontFamily.sans],
        jalnan: ['JalnanGothic'],
      },
      colors: {
        devoca: '#00B4D8',
        devoca_sky : '#ECFCFF',
      }
    },
  },
  plugins: [require("daisyui")],
}

