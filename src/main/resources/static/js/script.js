console.log("Script Loaded");

let currentTheme = getTheme();

changeTheme();

function changeTheme() {
  document.querySelector("html").classList.add(currentTheme);

  const changeThemebutton = document.querySelector("#theme_change_button");

  changeThemebutton.addEventListener("click", () => {
    console.log("clicked");
    oldtheme = currentTheme;
    if (currentTheme === "light") {
      currentTheme = "dark";
    } else {
      currentTheme = "light";
    }
    setTheme(currentTheme);
    document.querySelector("html").classList.remove(oldtheme);
    document.querySelector("html").classList.add(currentTheme);

    changeThemebutton.querySelector("span").textContent =
      currentTheme === "light" ? "Dark" : "Light";
  });
}
function setTheme(theme) {
  localStorage.setItem("theme", theme);
}

function getTheme() {
  let theme = localStorage.getItem("theme");
  if (theme) return theme;
  else return "light";
}
