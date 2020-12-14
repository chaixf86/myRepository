package com.project.component;

/**
 * ����
 * @author chaixf
 *
 */
public interface Component {
	void operation();
}

//Ҷ�ӽڵ�
interface Left extends Component {
}

//�������
interface Composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component gitChild(int i);
}
