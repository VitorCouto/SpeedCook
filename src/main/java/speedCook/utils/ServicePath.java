package speedCook.utils;

public final class ServicePath {

	///////////////////////////////////////////////////////////////
	// ROOT PATH
	///////////////////////////////////////////////////////////////

	public static final String ALL = "/**";

	public static final String ROOT_PATH = "/api";

	public static final String PUBLIC_ROOT_PATH = ROOT_PATH + "/public";

	public static final String PRIVATE_ROOT_PATH = ROOT_PATH + "/private";

	///////////////////////////////////////////////////////////////
	// PRIVATE PATHS
	///////////////////////////////////////////////////////////////

	public static final String PERMISSION_PATH = PRIVATE_ROOT_PATH + "/permission";

	public static final String APRAZO_PATH = PRIVATE_ROOT_PATH + "/aprazo";

	public static final String EMPRESA_PATH = PRIVATE_ROOT_PATH + "/empresa";

	public static final String EMPRESA_ID_PATH = PRIVATE_ROOT_PATH + "/empresa/empresa?id=";

	public static final String ITENSPEDIDO_PATH = PRIVATE_ROOT_PATH + "/itensPedido";

	public static final String ITENSPEDIDO_ID_PATH = PRIVATE_ROOT_PATH + "/itenspedido/pedido?id=";

	public static final String PESSOA_PATH = PRIVATE_ROOT_PATH + "/pessoa";

	public static final String PEDIDO_PATH = PRIVATE_ROOT_PATH + "/pedido";

	public static final String PEDIDO_USER_PATH = PRIVATE_ROOT_PATH + "/pedido/byuser";

	public static final String PEDIDO_EMPRESA_PATH = PRIVATE_ROOT_PATH + "/pedido/byempresa";

	public static final String PRODUTO_PATH = PRIVATE_ROOT_PATH + "/produto";

	public static final String STATUS_PATH = PRIVATE_ROOT_PATH + "/status";

	///////////////////////////////////////////////////////////////
	// PUBLIC PATHS
	///////////////////////////////////////////////////////////////

	public static final String LOGIN_PATH = PUBLIC_ROOT_PATH + "/login";

	public static final String LOGOUT_PATH = PUBLIC_ROOT_PATH + "/logout";

}
