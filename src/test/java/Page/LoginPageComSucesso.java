package Page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Map.LoginElementMap;
import Setup.Configuracao;
import io.cucumber.java.it.Date;

public class LoginPageComSucesso extends LoginElementMap{
	static WebDriver driver;
	
	public LoginPageComSucesso() {
		PageFactory.initElements(Configuracao.getDriver(), this);
	}
	
	public void clicarBtnLogin() {
		BtnLogin.click();
	}
	
	public void clicarMenuLateral() {
		BtnMenuLateral.click();
	}
	
	public void clicarOpcaoFiltro() {
		BtnFiltro.click();
	}
	
	public void clicarMenorParaMaior() {
		BtnMenorParaMaior.click();
	}
	
	public void clicarBtnFazerLogin() {
		BtnFazerLogin.click();
	}
	
	public void clicarBtnProxima() {
		BtnProxima.click();
	}
	
	public void EscreverUser() throws InterruptedException {
		InputEmail.sendKeys("@hotmail.com");
	}
	
	public void EscreverUsuario() throws InterruptedException {
		UserName.sendKeys("standard_user");
	}
	
	public void EscreverSenhaYT() throws InterruptedException {
		InputSenha.sendKeys("");
	}
	
	public void EscreverSenha() throws InterruptedException {
		UserPassword.sendKeys("secret_sauce");
	}

	public void digitarCpfValido() {
		TxtCpf.sendKeys("18816364530");
	}
	
	public void digitarSenhaValida() {
		TxtSenha.sendKeys("123456");
	}
	
	
	public void validaLoginComSucesso() throws Exception {
		TxtProducts.isDisplayed();
//		notexistsElement(TxtProducts);
//		existsElement(TxtProducts);
	}
	
//	public boolean elementoNaoExiste(element){
//	    Boolean naoexiste = !(driver.findElements(element).size() > 0);
//	    return naoexiste;
//	}
	
	private boolean notexistsElement(WebElement element) {
		assertFalse(element.isDisplayed());
		return true;
		
		//	    try {
//			driver.findElement((By)(element));
//	    } catch (NoSuchElementException e) {
//	        return false;
//	    }
//	    return true;
	}


	public boolean ElementIsNotVisible(WebElement element) throws Exception {
		if(!element.isDisplayed()) {
			return true;
		} else
			return false;
	}
	
	public void validarMenuBurguer() throws Exception {
		BtnAllItens.isDisplayed();
		
	}
	
	public void validarYoutubeHome() throws Exception {
		TxtTudo.isDisplayed();
		
	}
	
	public void validarGeHome() throws Exception {
		TxtGe.isDisplayed();
		
	}
	
	
	public void validarFiltroMenorParaMaior() throws Exception {
		String getMenorPreco = txtProdutoMenorPreco.getText();
		assertEquals("$7.99", getMenorPreco);
	}
	
	
	public void validarSwagLabsHome() throws Exception {
		//String getLogo = LoginLogo.getText();
		//assertEquals("Accepted usernames are:", getLogo);
		LoginLogo.isDisplayed();
//		String LoginLogo = driver.findElement(By.xpath("login_logo")).getText();
//        assertEquals("texto-esperado", LoginLogo);
		
	}
	
	
	
	public static WebDriver getDriver() {
		return driver;
	}
}
