import re

# Expressões regulares
LOGIN_REGEX = r"^(?=.*[A-Za-z])(?=.*\d)(?=.*[!@#$%^&*(),.?\":{}|<>]).{5,30}$"
PASSWORD_REGEX = r"^(?=.*[A-Z])(?=.*\d)(?=.*[!@#$%^&*(),.?\":{}|<>])(?=.*[a-z]).{8,12}$"

def is_valid_login(login):
    return re.match(LOGIN_REGEX, login) is not None

def is_valid_password(password):
    return re.match(PASSWORD_REGEX, password) is not None

# Testando a validação
if __name__ == "__main__":
    logins = ["user1@", "valid_login123!", "sh0rt", "this_login_is_way_too_long_and_invalid!", "valid@user2023"]
    passwords = ["Passw0rd!", "Short1@", "Valid1@", "invalidpassword", "V@l1dPassword!"]

    print("Validação de Logins:")
    for login in logins:
        print(f"Login: {login} é válido? {is_valid_login(login)}")

    print("\nValidação de Senhas:")
    for password in passwords:
        print(f"Senha: {password} é válida? {is_valid_password(password)}")