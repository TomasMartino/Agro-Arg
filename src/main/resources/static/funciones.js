document.addEventListener("DOMContentLoaded", function () {
  // Abrir y cerrar el modal
  const modal = document.getElementById("modal");
  const openModalBtn = document.getElementById("openModalBtn");
  const closeModalBtn = document.getElementsByClassName("close")[0];

  openModalBtn.onclick = function () {
    modal.classList.add("show");
  };

  closeModalBtn.onclick = function () {
    modal.classList.remove("show");
  };

  window.onclick = function (event) {
    if (event.target === modal) {
      modal.classList.remove("show");
    }
  };
});

document.addEventListener("DOMContentLoaded", function () {
  const openRegisterBtn = document.getElementById("open-register");
  const modalRegister = document.getElementById("modal-register");

  if (openRegisterBtn && modalRegister) {
    openRegisterBtn.addEventListener("click", () => {
      const loginForm = document.getElementById("login-form");
      if (loginForm.classList.contains("show")) {
        loginForm.classList.remove("show");
      }
      modalRegister.classList.add("show");
    });
    const closeRegisterBtn = document.querySelector("#modal-register .close");
    closeRegisterBtn.addEventListener("click", () => {
      modalRegister.classList.remove("show");
    });
  } else {
    console.error("Elementos no encontrados en el DOM");
  }
});
/*relacion backend-frontend regsitro */

document.addEventListener("DOMContentLoaded", () => {
  const registerForm = document.getElementById("register-form");
  const registerButton = document.getElementById("register-button");

  registerButton.addEventListener("click", (e) => {
    e.preventDefault();
    const username = document.getElementById("username").value;
    const firstname = document.getElementById("firstname").value;
    const lastname = document.getElementById("lastname").value;
    const password = document.getElementById("password").value;

    const registerRequest = {
      username,
      firstname,
      lastname,
      password,
    };

    fetch("http://localhost:8080/auth/register", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(registerRequest),
    })
      .then((response) => {
        console.log(response);
        return response.json();
      })
      .then((data) => {
        try {
          console.log(data);
        } catch (error) {
          console.error(error);
        }
      })
      .catch((error) => console.error(error));
  });
});

/*relacion backend-frontend login */
document.addEventListener("DOMContentLoaded", () => {
  const loginForm = document.getElementById("login-form");
  const usernameInput = document.getElementById("username");
  const passwordInput = document.getElementById("password");

  loginForm.addEventListener("submit", async (event) => {
    event.preventDefault();

    const username = usernameInput.value;
    const password = passwordInput.value;

    const loginData = {
      username,
      password,
    };

    try {
      const response = await fetch("http://localhost:8080/auth/login", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(loginData),
      });

      if (response.ok) {
        const token = await response.text();
        localStorage.setItem("token", token);
        window.location.href = "/index.html";
        alert("Login exitoso");
      } else {
        alert("Login fallido");
      }
    } catch (error) {
      alert("Error al realizar el login: " + error.message);
    }
  });

  
});
