/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mybot;

import ai.core.AI;
import ai.core.AIWithComputationBudget;
import ai.core.ParameterSpecification;
import java.util.ArrayList;
import java.util.List;
import rts.GameState;
import rts.PlayerAction;
import rts.units.UnitTypeTable;
/**
 *
 * @author austinly
 */
public class MyBot extends AIWithComputationBudget {
         
    UnitTypeTable m_utt = null;
    
    public MyBot(UnitTypeTable utt) {
        
    super(-1, -1);
    m_utt = utt; // Initialize m_utt first
    

    }

    @Override
    public void reset() {
             
    }

    @Override
    public PlayerAction getAction(int player, GameState gs) throws Exception {
        PlayerAction pa = new PlayerAction();
        pa.fillWithNones(gs, player, 10);
        return pa;
        
        
    }


    public AI clone() {
        return new MyBot(m_utt);
    }

    @Override
    public List<ParameterSpecification> getParameters() {
        return new ArrayList<>();
    }
     
}
