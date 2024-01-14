class Exit extends Transaction {
        public Exit() {
            super(null);
        }
    
        @Override
        public void execute() {
            System.out.println("Vous etes maitenant sortie du guichet automatique. Merci!");
            System.exit(0);
        }
    }
    

