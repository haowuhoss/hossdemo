package factory.abstractFactory;

public interface ICarFactory {
	IEngine creatEngine();
	IShell creatShell();
}
