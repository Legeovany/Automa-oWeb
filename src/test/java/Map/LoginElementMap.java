package Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMap {

	@FindBy(id =  "login-button")
	protected WebElement BtnLogin;
	
	@FindBy(id =  "react-burger-menu-btn")
	protected WebElement BtnMenuLateral;
	
	@FindBy(id =  "inventory_sidebar_link")
	protected WebElement BtnAllItens;
	
	@FindBy(xpath =  "//select")
	protected WebElement BtnFiltro;
	
	@FindBy(xpath =  "//option[contains(text(),'Price (low to high)')]")
	protected WebElement BtnMenorParaMaior;
	
	@FindBy(xpath =  "(//div[@class='inventory_item_price'])[1]")
	protected WebElement txtProdutoMenorPreco;
	
	@FindBy(name =  "nationality")
	protected WebElement RdbNacionalidade;
	
	@FindBy(id =  "user-name")
	protected WebElement UserName;
	
	@FindBy(xpath =  "//input[@id='password']")
	protected WebElement UserPassword;
	
	@FindBy(name =  "cpf")
	protected WebElement TxtCpf;
	
	@FindBy(id =  "senha")
	protected WebElement TxtSenha;
	
	@FindBy(id =  "login-button")
	protected WebElement BtnLoginModal;
	
	@FindBy(xpath =  "//h4")
	protected WebElement LoginLogo;
	
	@FindBy(xpath =  "//span[contains(text(),'Products')]")
	protected WebElement TxtProducts;
	
	@FindBy(xpath = "//*[@id=\"form-login\"]/div[1]/div/div/div[2]/div")
	protected WebElement nameLogin;
	
	@FindBy(xpath = "(//yt-formatted-string[contains(text(),'Tudo')])[1]")
	protected WebElement TxtTudo;
	
	@FindBy(xpath = "(//yt-formatted-string[contains(text(),'Fazer login')])[1]")
	protected WebElement BtnFazerLogin;
	
	@FindBy(xpath = "//input[@id='identifierId']")
	protected WebElement InputEmail;
	
	@FindBy(xpath = "//input[@type='password']")
	protected WebElement InputSenha;
	
	@FindBy(xpath = "//span[contains(text(),'Próxima')]")
	protected WebElement BtnProxima;
	
	@FindBy(xpath = "(//h1)[1]")
	protected WebElement TxtGe;
	
}
