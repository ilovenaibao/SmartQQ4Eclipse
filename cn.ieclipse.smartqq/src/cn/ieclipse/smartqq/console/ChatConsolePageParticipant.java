/*
 * Copyright 2014-2015 ieclipse.cn.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.ieclipse.smartqq.console;

import org.eclipse.jface.action.Action;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsolePageParticipant;
import org.eclipse.ui.console.actions.CloseConsoleAction;
import org.eclipse.ui.part.IPageBookViewPage;

import cn.ieclipse.smartqq.actions.FileAction;
import cn.ieclipse.smartqq.actions.NextChatAction;
import cn.ieclipse.smartqq.actions.PrevChatAction;
import cn.ieclipse.smartqq.actions.ProjectFileAction;
import cn.ieclipse.smartqq.actions.SendAction;

/**
 * 类/接口描述
 * 
 * @author Jamling
 * @date 2017年6月19日
 *       
 */
public class ChatConsolePageParticipant implements IConsolePageParticipant {
    
    @Override
    public <T> T getAdapter(Class<T> adapter) {
        // TODO Auto-generated method stub
        return null;
    }
    
    @Override
    public void init(IPageBookViewPage page, IConsole console) {
        IActionBars actionBars = page.getSite().getActionBars();
        String group = IConsoleConstants.LAUNCH_GROUP;
        Action action = new CloseConsoleAction(console);
        actionBars.getToolBarManager().appendToGroup(group, action);
        action = new SendAction((ChatConsole) console);
        actionBars.getToolBarManager().appendToGroup(group, action);
        action = new PrevChatAction((ChatConsole) console);
        actionBars.getToolBarManager().appendToGroup(group, action);
        action = new NextChatAction((ChatConsole) console);
        actionBars.getToolBarManager().appendToGroup(group, action);
        action = new FileAction((ChatConsole) console);
        actionBars.getToolBarManager().appendToGroup(group, action);
        action = new ProjectFileAction((ChatConsole) console);
        actionBars.getToolBarManager().appendToGroup(group, action);
    }
    
    @Override
    public void dispose() {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void activated() {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void deactivated() {
        // TODO Auto-generated method stub
        
    }
    
}
