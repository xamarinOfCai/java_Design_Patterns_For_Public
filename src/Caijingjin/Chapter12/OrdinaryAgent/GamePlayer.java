package Caijingjin.Chapter12.OrdinaryAgent;

public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(IGamePlayer _gamePlayer,String _name) throws Exception {
        if(_gamePlayer == null){
            throw new Exception("不能创建真是角色！");
        }else{
            this.name = _name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println("用户：user = " + user+this.name + "]的用户成功 ");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+" 在打怪升级");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name+ " 又升了一级了！");
    }
}
