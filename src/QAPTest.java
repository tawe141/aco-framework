/*
 * Copyright 2014 Thiago Nascimento
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import problem.Problem;
import problem.QuadraticAssignmentProblem;
import sys.ExecutionStats;
import aco.ACO;
import aco.AntSystem;

/**
 * The QAPTest Class
 * 
 * @author Thiago Nascimento
 * @since 2014-07-13
 * @version 1.0
 */
public class QAPTest {

	private static int ants = 10;

	private static int interations = 10;

	public static void main(String[] args) {
		Problem p = new QuadraticAssignmentProblem("in/Chr12a.qap");
		ACO aco = new AntSystem(p, ants, interations);
//		ACO aco = new AntColonySystem(p, ants, interations);

		ExecutionStats es = ExecutionStats.execute(aco, p);
		es.printStats();
	}
}
