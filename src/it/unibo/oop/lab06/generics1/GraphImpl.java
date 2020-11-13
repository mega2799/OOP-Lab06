package it.unibo.oop.lab06.generics1;

import java.util.*;


public class GraphImpl<N> implements Graph<N> {
	
	final private Map<N,Set<N>> edges = new HashMap<>();
	
	@Override
	public void addNode(N node) {
		this.edges.put(node,new TreeSet<>());
	}

	@Override
	public void addEdge(N source, N target) {
		if(this.edges.containsKey(source)) {
			this.edges.get(source).add(target);
		}
	}

	@Override
	public Set<N> nodeSet() {
		return this.edges.keySet();
	}

	@Override
	public Set<N> linkedNodes(N node) {
		return this.edges.get(node);
	}

//	final List<N> simpleList = new LinkedList<>();

	public List<N> pathFinder(N source, N target,List<N> list) {
		list.add(source);
		for( N ite : this.edges.get(source)){
			if (ite.equals(target)){
				list.add(target);
				return list;
			} else {
				return pathFinder(ite,target,list);
			}
		}
		return null; // fail 
	}
	
	public List<N> getPath(N source, N target) {
		final List<N> simpleList = new LinkedList<>();
		return pathFinder(source,target,simpleList);
	}
}
